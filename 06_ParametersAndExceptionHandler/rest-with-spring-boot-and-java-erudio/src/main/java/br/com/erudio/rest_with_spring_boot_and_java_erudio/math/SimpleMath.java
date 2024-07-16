package br.com.erudio.rest_with_spring_boot_and_java_erudio.math;

public class SimpleMath {

    public Double sum( Double numberOne, Double numberTwo) throws Exception {

        return numberOne + numberTwo;
    }

    public Double minus( Double numberOne, Double numberTwo){

        return numberOne - numberTwo;
    }

    public Double times(Double numberOne, Double numberTwo){

        return numberOne * numberTwo;
    }

    public Double div(Double numberOne, Double numberTwo){

        return numberOne / numberTwo;
    }

    public Double mean(Double numberOne, Double numberTwo){

        return (numberOne + numberTwo) / 2;
    }

    public Double sqrt(Double number){

        return Math.sqrt(number) ;
    }
}
