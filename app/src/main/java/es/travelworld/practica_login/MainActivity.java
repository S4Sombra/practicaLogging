package es.travelworld.practica_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout usernameInputLayout, passwordInputLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameInputLayout = findViewById(R.id.usernameInputLayout);
        passwordInputLayout = findViewById(R.id.passwordInputLayout);
        TextView getNewAccount = findViewById(R.id.getnewAccount_text);
        TextView getNewPassword = findViewById(R.id.getnewPassword_text);

        // Listener conjunto para el logging.
        findViewById(R.id.loginButton).setOnClickListener(view -> {
            String username = usernameInputLayout.getEditText().getText().toString();
            String password = passwordInputLayout.getEditText().getText().toString();

            if (username.isEmpty()) {
                usernameInputLayout.setError("Username is required");
            } else if (password.isEmpty()) {
                passwordInputLayout.setError("Password is required");
            } else {
                Snackbar.make(view,"Login CORRECTO",Snackbar.LENGTH_LONG).show();
            }




        });


        //Snackbars para los textview de recuperar password y cuenta nueva.

        getNewAccount.setOnClickListener(view -> Snackbar.make(view,"Esta función se implementará pronto",Snackbar.LENGTH_LONG).show());

        getNewPassword.setOnClickListener(view -> Snackbar.make(view,"Esta función se implementará pronto",Snackbar.LENGTH_LONG).show());


    }



}