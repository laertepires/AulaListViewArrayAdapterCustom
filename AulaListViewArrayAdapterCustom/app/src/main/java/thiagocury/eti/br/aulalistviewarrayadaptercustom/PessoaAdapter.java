package thiagocury.eti.br.aulalistviewarrayadaptercustom;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import jp.wasabeef.picasso.transformations.CropCircleTransformation;

/**
 * Created by Alunos on 19/12/2016.
 */

public class PessoaAdapter extends ArrayAdapter<Pessoa>{

    private Context context;
    private ArrayList<Pessoa> pessoas;

    public PessoaAdapter(Context context, ArrayList pessoas) {
        super(context, 0, pessoas);

        this.context = context;
        this.pessoas = pessoas;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.linha_pessoa,null);
        }//fecha if

        //Pegar objeto!
        Pessoa p = pessoas.get(position);

        //TextView nome
        TextView tvNome = (TextView)
                convertView.findViewById(R.id.lp_tv_nome);
        tvNome.setText(p.getNome());
        //TextView idade
        TextView tvIdade = (TextView)
                convertView.findViewById(R.id.lp_tv_idade);
        //CUIDADO! MUITO CUIDADO COM AS CONVERSÕES
        tvIdade.setText(String.valueOf(p.getIdade()));
        //TextView Sexo
        TextView tvSexo = (TextView)
                convertView.findViewById(R.id.lp_tv_sexo);
        tvSexo.setText(p.getSexo());

        ImageView ivSexo = (ImageView)
                convertView.findViewById(R.id.lp_iv_sexo);

        if(p.getSexo().equalsIgnoreCase("Masculino")) {
            Picasso.with(context)
                   .load(p.getURLHomem())
                   .placeholder(R.mipmap.ic_launcher)
                    .transform(new CropCircleTransformation())
                   .into(ivSexo);
        }else{
            Picasso.with(context)
                   .load(p.getURLMulher())
                   .placeholder(R.mipmap.ic_launcher)
                   .transform(new CropCircleTransformation())
                   .into(ivSexo);
        }


        return convertView;
    }
}//fecha classe