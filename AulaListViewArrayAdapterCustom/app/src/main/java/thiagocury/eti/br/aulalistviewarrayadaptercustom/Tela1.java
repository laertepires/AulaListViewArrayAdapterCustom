package thiagocury.eti.br.aulalistviewarrayadaptercustom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Tela1 extends AppCompatActivity {

    //Widgets
    private EditText etNome;
    private EditText etIdade;
    private EditText etSexo;
    private Button btnOK;
    private ListView lvPessoas;
    //Objeto
    private Pessoa p;
    //Array + Adapter
    private ArrayList<Pessoa> pessoas;
    private PessoaAdapter adapter; //Adapter customizado

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        //Referencias
        etNome = (EditText) findViewById(R.id.t1_et_nome);
        etIdade = (EditText) findViewById(R.id.t1_et_idade);
        etSexo = (EditText) findViewById(R.id.t1_et_sexo);
        lvPessoas = (ListView) findViewById(R.id.t1_lv_pessoas);
        btnOK = (Button) findViewById(R.id.t1_btn_ok);

        //Adapter
        pessoas = new ArrayList<>(); //ArrayList vazio!
        adapter = new PessoaAdapter(Tela1.this,pessoas);
        lvPessoas.setAdapter(adapter);

        //Clique do botão
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p = new Pessoa();
                p.setNome(etNome.getText().toString());
                p.setSexo(etSexo.getText().toString());
                p.setIdade(
                    Integer.parseInt(etIdade.getText().toString()));
                pessoas.add(p);
                adapter.notifyDataSetChanged();
                Toast.makeText(
                        getBaseContext(),
                        "Pessoa cadastrada com sucesso!",
                        Toast.LENGTH_LONG).show();
            }
        });

    }//fecha onCreate
}//fecha classe
