package br.com.VollMed.util;

public class MaskFormatter {

    public static String maskCpf(String cpf) {
        if (cpf.length() != 11) {
            throw new IllegalArgumentException("CPF deve conter 11 dígitos.");
        }
        return cpf.substring(0,3) + "." +
                cpf.substring(3,6) + "." +
                cpf.substring(6, 9) + "-" +
                cpf.substring(9, 11);
    }

    public static String mackPhone(String phone) {
        if (phone.length() != 11) {
            throw new IllegalArgumentException("Número do celular deve conter 11 dígitos.");
        }
        return "("+phone.substring(0,2)+") " +
                phone.substring(2,7) + "-" +
                phone.substring(7,11);
    }

    public static String maskZipCode(String zipCode) {
        if (zipCode.length() != 8) {
            throw new IllegalArgumentException("CEP deve conter 8 dígitos.");
        }
        return zipCode.substring(0, 5) + "-" +
                zipCode.substring(5,8);
    }
}
