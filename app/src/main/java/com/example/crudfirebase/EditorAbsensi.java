package com.example.crudfirebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class EditorAbsensi extends AppCompatActivity {

    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private ProgressDialog progressDialog;
    private EditText nim, nama, matkul,pertemuan ;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absensi);

        //deklarasi
        nim = findViewById(R.id.txtNim);
        nama = findViewById(R.id.txtNama);
        matkul = findViewById(R.id.txtPel);
        pertemuan = findViewById(R.id.txtPer);
        btnSave = findViewById(R.id.btn_save);

        progressDialog = new ProgressDialog(EditorAbsensi.this);
        progressDialog.setTitle("Loading");
        progressDialog.setMessage("Menyimpan Data");

        btnSave.setOnClickListener(view -> {
            if (nim.getText().length()>0 && nama.getText().length()>0 && matkul.getText().length()>0 && pertemuan.getText().length()>0){
                saveData(nim.getText().toString(), nama.getText().toString(), matkul.getText().toString(), pertemuan.getText().toString());
            }else{
                Toast.makeText(getApplicationContext(), "Hai", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void saveData(String nim, String nama,String matkul, String pertemuan) {
        Map<String, Object> Absensi = new HashMap<>();
        Absensi.put("name", nama);
        Absensi.put("nim", nim);
        Absensi.put("matkul", matkul);
        Absensi.put("pertemuan", pertemuan);

        progressDialog.show();
        db.collection("Absensi")
                .add(Absensi)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_SHORT).show();
                        progressDialog.dismiss();
                        finish();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(getApplicationContext(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressDialog.dismiss();
                    }
                });
    }
}