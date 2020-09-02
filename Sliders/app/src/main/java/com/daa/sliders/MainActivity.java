package com.daa.sliders;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper oSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Definir el arreglo de los imagenes del sliders
        int  imagenes[] = {R.drawable.correr, R.drawable.yoga, R.drawable.pilates};
        oSlider = findViewById(R.id.slider);
        //Asociar wel arreglo de imagenes y cargarlo automaticamente en pantalla
        for (int imagen: imagenes){
            cambiarImagenes(imagen);
        }
    }

    public void cambiarImagenes(int imagen){

        ImageView vImagen = new ImageView(this);
        vImagen.setBackgroundResource(imagen);
        //Carga y configuración de sliders
        oSlider.addView(vImagen);
        oSlider.setFlipInterval(4000);
        oSlider.setAutoStart(true);
        //Configuracionde la animación
        oSlider.setInAnimation(this,android.R.anim.slide_in_left);
        oSlider.setInAnimation(this,android.R.anim.slide_out_right);

    }
}