package mock;

import c14.service.InimigoService;

public class MockInimigoService implements InimigoService {
    @Override
    public String busca(int id) {
        if(id == 10)
            return InimigoConst.SKELETON;
        return InimigoConst.ARANHA;
    }

    @Override
    public boolean inimigoExistente(int id) {
        return false;
    }
}
