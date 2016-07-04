package id.or.codelabs.beelajar.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import id.or.codelabs.beelajar.R;

public class SignIn extends AppCompatActivity {

    private EditText txtEmail;
    private EditText txtPassword;
    private Button btnSignIn;
    private Button btnForgetPassword;
    private Button btnActivitySignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        declareWidget();

        buttonClickedActionPerformed();
    }

    private void buttonClickedActionPerformed() {
        btnForgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Button forget password clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String email = txtEmail.getText().toString().trim();

                Intent intent = new Intent(SignIn.this,MainActivity.class);
                /*
                intent.putExtra(MainActivity.KEY_DATA, email);
                startActivityForResult(intent, 0);
                */
                startActivity(intent);
            }
        });

        btnActivitySignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn.this, SignUp.class);
                startActivity(intent);
            }
        });
    }

    private void declareWidget() {
        txtEmail = (EditText)findViewById(R.id.txt_email);
        txtPassword = (EditText)findViewById(R.id.txt_password);
        btnForgetPassword = (Button)findViewById(R.id.btn_forget_password);
        btnSignIn = (Button)findViewById(R.id.btn_sign_in);
        btnActivitySignUp = (Button)findViewById(R.id.btn_activity_sign_up);
    }
}
