package util;

public class MessageUtil {
    private static void SHOW_ERROR(String erro){
        System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("\t" + erro);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public static void ERRO_PADRAO(){
        SHOW_ERROR("OPS! ALGO DEU ERRADO :(");
    }

    public static void ERRO_IMPOSSIVEL_MINIMIZAR(){
        SHOW_ERROR("IMPOSSÍVEL REALIZAR A MINIMIZAÇÃO");
    }

    public static void ERRO_ESCOLHA_INVALIDA(){
        SHOW_ERROR("ESCOLHA INVÁLIDA");
    }

    public static void ERRO_NENHUM_AUTOMATO(){
        SHOW_ERROR("NENHUM AUTOMATO ENCONTRADO");
    }
}
