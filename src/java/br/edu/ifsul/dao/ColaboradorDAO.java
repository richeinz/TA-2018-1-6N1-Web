/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.dao;

import br.edu.ifsul.modelo.Colaborador;
import java.io.Serializable;
import javax.ejb.Stateful;

/**
 *
 * @author Ricardo
 */
@Stateful
public class ColaboradorDAO<TIPO> extends DAOGenerico<Colaborador> implements Serializable{
    
    public ColaboradorDAO(){
        super();
        classePersistente = Colaborador.class;
        ordem = "nome";
        maximoObjetos = 3;
    }
}
