package ru;

class PhoneNumber {
    private String countryCode;
    private String operatorCode;
    private String prefix;
    private String num;

    public PhoneNumber(String number) {
            countryCode = String.valueOf(number.charAt(number.length() - 11));
            operatorCode = number.substring(number.length() -10, number.length() -7);
            prefix = number.substring(number.length() -7, number.length() -4);
            num = number.substring(number.length() -4);
    }

    @Override
    public String toString() {
        return "+" + countryCode + operatorCode + "-" + prefix + "-" + num;
    }
}

