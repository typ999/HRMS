package com.iotek.dao;

import com.iotek.model.RECRES;

import java.util.List;

public interface RECRESMapper {
    boolean addRECRES(RECRES recres);
    List<RECRES> getRECRESByREC(RECRES recres);
    List<RECRES> getRECRESByRES(RECRES recres);
    List<RECRES> getRECRESById(RECRES recres);
}
