import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;


public class CalcTests {


    @Test
    public void SlojenieDrobnihChisel() {
        assertEquals("Сложение двух дробных чисел выполняется некорректно!",5.22, Calc.plus(2.11, 3.11), 0);
    }


    @Test
    public void VichitanieDrobnihChisel() {
        assertEquals("Вычитание двух дробных чисел выполняется некорректно!", 5.4, Calc.minus(10,4.6), 0);
    }


    @Test
    public void UmnojenieDrobnihChisel() {
        assertEquals("Умножение дробных чисел выполняется некорректно!", 29.7303,Calc.umn(3.39, 8.77), 0);
    }


    @Test
    public void UmnojenieDrobnogoChislaNaNol() {
        assertEquals("Умножение на ноль выполняется некорректно!", 0, Calc.umn(4.22, 0), 0);
    }


    @Test
    public void DelenieDrobnihChisel() {
        assertEquals("Деление дробных чисел выполняется некорректно!",3.650933040614709, Calc.del(33.26, 9.11), 0);
    }


    @Test
    public void DelenieChislaNaNol() {
        assertSame("Деление на ноль выполняется некорректно!", "Infinity", Calc.del(5, 0));
    }


    @Test
    public void DelenieNulaNaChislo() {
        assertEquals("Деление нуля на число выполнено некорректно!", 0, Calc.del(0, 5), 0);
    }


    @Test
    public void SlojenieChislaSNulem() {
        assertEquals("Сложение числа с нулем выполнено некорректно!",2.11, Calc.plus(2.11, 0), 0);
    }


    @Test
    public void VichitanieChislaIzNula() {
        assertEquals("Вычитание числа из нуля выполнено некорректно!", -4.6, Calc.minus(0,4.6), 0);
    }


    @Test
    public void VichitanieNulaIzChisla() {
        assertEquals("Вычитание нуля из числа выполняется некорректно!", 4.6, Calc.minus(4.6,0), 0);
    }
}

/*
import static org.junit.Assert.*;

public class CalcTests {

    @org.junit.Test
    public void getFirstNumber() {
    }

    @org.junit.Test
    public void setFirstNumber() {
    }

    @org.junit.Test
    public void getSecondNumber() {
    }

    @org.junit.Test
    public void setSecondNumber() {
    }

    @org.junit.Test
    public void plus() {
    }

    @org.junit.Test
    public void minus() {
    }

    @org.junit.Test
    public void umn() {
    }

    @org.junit.Test
    public void del() {
    }
}
*/