package com.company;

public class BooleanFuncoes {

    static boolean conjuncao(boolean valorum, boolean valordois){
        if(valorum && valordois)
            return true;
        else return false;
    }

    boolean disjuncao (boolean valorum, boolean valordois){
        if (valorum || valordois)
            return true;
        else return  false;
    }
}
