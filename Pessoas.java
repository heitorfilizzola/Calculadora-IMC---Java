package Pessoas;

public class Pessoas {
    private String nome;
    private int idade;
    private double peso;
    private double quilos;
    private double altura;
    private double imc;

    public void envelhecer(){
        idade = idade + 1;
    }

    public double engordar(){
        peso = peso + quilos;
        return peso;
    }

    public double emagrecer(){
         peso = peso - quilos;
         return peso;
    }

    public void imcCalc(){
        imc = peso/(altura * altura);
    }

    public String imcClass(){
        if (imc <= 16.5){
            return "Muito Abaixo do peso";
        } else if (imc >= 17 && imc <= 18.4){
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9){
            return "Peso normal";
        } else if (imc >= 25 && imc <= 29.9){
            return "Acima do peso";
        } else if (imc >= 30 && imc <= 34.9){
            return "Obesidade grau 1";
        } else if (imc >= 35 && imc <= 40){
            return "Obesidade grau 2";
        } else {
            return "Obesidade grau 3";
        }
    }

// imc = peso /(altura*altura)
// <16.9 muito abaixo do peso
// 17 a 18.4 abaixo do peso
// 18.5 a 24.9 peso normal
// 25 a 29.9 acima do peso
// 30 a 34.9 obesidade 1
// 35 a 40 obesidade 2
// 40+ obesidade 3

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setQuilos(double quilos){
        this.quilos = quilos;
    }

    public void setAlt(double altura){
        this.altura = altura;
    }

    public double getAlt(){ return altura; }

    public double getImc(){ return imc; }

    public String getImcClass(){ return imcClass(); }

}

