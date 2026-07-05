package org.example;

import java.util.ArrayList;

public class PlataformaStreaming {
    private ArrayList<CuentaUser> Corteos;

    public PlataformaStreaming(){
        this.Corteos = new ArrayList<>();
    }

    public void registrarUsuario(CuentaUser nuevo){
        this.Corteos.add(nuevo);
    }





}
