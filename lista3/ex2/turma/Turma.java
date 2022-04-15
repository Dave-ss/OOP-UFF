/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2.turma;

import com.mycompany.ex2.disciplina.Disciplina;
import com.mycompany.ex2.professor.Professor;
import com.mycompany.ex2.aluno.Aluno;


/**
 *
 * @author davi2
 */
public class Turma {
    private Disciplina disciplina;
    private int qtd_aluno=0;
    private Aluno aluno[] = new Aluno[qtd_aluno];
    private int sala;
    private String turno;
    private String predio;
    private Professor professor;

    public Turma(){

    }
    
    public void criaTurma(Disciplina d, int qtd_aluno, String predio, int sala, Professor p, String turno){

    }
   
}
