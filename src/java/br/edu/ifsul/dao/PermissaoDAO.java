/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.dao;

import br.edu.ifsul.modelo.Permissao;
import java.io.Serializable;
import javax.ejb.Stateful;

/**
 *
 * @author Ricardo
 */
@Stateful
public class PermissaoDAO<TIPO> extends DAOGenerico<Permissao> implements Serializable{
    
    public PermissaoDAO(){
        super();
        classePersistente = Permissao.class;
        ordem = "nome";
        maximoObjetos = 3;
    }
}
