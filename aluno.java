



package br.com.escola.model;

public class aluno {
    private String nome; 
    private double nota1;
    private double nota2;



public aluno(String nome, double nota1, double nota2) {
	this.nome = nome;
	this.nota1 = nota1;
	this.nota2 = nota2;
	
	

   }
public String getNome(){
	return nome;
   }
public double getMedia() {
	return(nota1 + nota2) /2;
   }
public String getSituacao() {
	return getMedia() >= 6.0 ? "Aprovado" : "Reprovado";
   }
@Override
public String toString() {
	return String.format(
		"%s | nota1: %1f | Nota2: %.1f | Media: %.1f | %s",
	    nome,
	    nota1,
	    nota2,
	    getMedia(),
	    getSituacao()
       );
	
    }

}





