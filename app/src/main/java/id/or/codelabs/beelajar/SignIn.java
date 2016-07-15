package id.or.codelabs.beelajar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {

    private Button btnSignIn;
    private Button btnForgetPassword;
    private Button btnActivitySignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        declareWidget();

        buttonClickedActionPerformed();
        Button forgot = (Button)findViewById(R.id.btn_forget_password);
        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forgot = new Intent(SignIn.this,ForgotPassword.class);
                startActivity(forgot);
            }
        });
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
                Intent intent = new Intent(SignIn.this,MainActivity.class);
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
         btnForgetPassword = (Button)findViewById(R.id.btn_forget_password);
        btnSignIn = (Button)findViewById(R.id.btn_sign_in);
        btnActivitySignUp = (Button)findViewById(R.id.btn_activity_sign_up);
    }
}
