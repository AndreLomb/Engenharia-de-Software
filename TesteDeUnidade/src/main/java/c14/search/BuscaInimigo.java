package c14.search;

import c14.model.Inimigo;
import c14.service.InimigoService;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaInimigo {

    InimigoService inimigoService;

    public BuscaInimigo(InimigoService service){
        this.inimigoService = service;
    }

    public Inimigo buscaInimigo(int id){

        String inimigoJson = inimigoService.busca(id);
        JsonObject jsonObject = JsonParser.parseString(inimigoJson).getAsJsonObject();

        return new Inimigo(jsonObject.get("nome").getAsString(),
                jsonObject.get("qtdVida").getAsDouble(),
                jsonObject.get("arma").getAsString());
    }

    public boolean verificaArrayListExistente(int id){
        boolean inimigoExistente = inimigoService.inimigoExistente(id);

        if (inimigoExistente){
            return true;
        }else{
            return false;
        }
    }

}