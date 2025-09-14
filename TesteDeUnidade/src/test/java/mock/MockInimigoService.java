package mock;

import c14.service.InimigoService;

import java.util.ArrayList;
import java.util.List;

public class MockInimigoService implements InimigoService {
    private List<Integer> idsValidos = new ArrayList<>();

    public void inserirIdValido(){
        idsValidos.clear();
        idsValidos.add(10);
        idsValidos.add(20);
    }

    public List<Integer> getIdsValidos(){
        return idsValidos;
    }

    @Override
    public String busca(int id) {
        if (id < 0){
            return InimigoConst.INEXISTENTE;
        }

        if(!idsValidos.contains(id)){
            return InimigoConst.INEXISTENTE;
        }

        if(id == 10) return InimigoConst.SKELETON;
        if(id == 20) return InimigoConst.ARANHA;

        return InimigoConst.INEXISTENTE;
    }

    @Override
    public boolean inimigoExistente(int id) {
        return false;
    }
}
