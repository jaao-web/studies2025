package ex006Tonner;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    // Construtor
    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    // Método para adicionar toner
    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    // Método para imprimir páginas
    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            System.out.println("Printing in duplex mode");
            pagesToPrint = (pages / 2) + (pages % 2); // arredonda para cima
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    // Método getter para pagesPrinted
    public int getPagesPrinted() {
        return this.pagesPrinted;
    }
}
