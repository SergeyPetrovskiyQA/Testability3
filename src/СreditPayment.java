public class СreditPayment {

    public double calculate(double percent, double credit, double creditTerm) { // ставка, сумма кредита, срок кредита(год)
        double convertTerm = creditTerm * 12; // конвертировать год в месяц
        double monthlyRate = percent / 12 / 100; // месячная ставка по кредиту
        double annuityRatioX = 1 + monthlyRate; // расчет ануитентного коэффициента
        double annuityRatioPow = Math.pow(annuityRatioX, convertTerm); // расчет ануитентного коэффициента
        double k = monthlyRate * annuityRatioPow / (annuityRatioPow - 1); // расчет ануитентного коэффициента
        double a = k * credit; // расчет ежемесячного платежа
        int b = (int) a;
        return b;

    }
}