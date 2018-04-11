package ru.job4j.calculator;

/**
 * Корвертор валюты.
 */
public class Converter {
    private int value;

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        this.value = value / 70;
        return this.value;
    }


    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры
     */
    public int rubleToDollar(int value) {
        this.value = value / 60;
        return this.value;
    }


    /**
     * Конвертируем рубли в доллары.
     * @param value евро.
     * @return Рубли
     */
    public int euroToRuble(int value) {
        this.value = value * 70;
        return this.value;
    }


    /**
     * Конвертируем рубли в доллары.
     * @param value доллары.
     * @return Рубли
     */
    public int dollarToRuble(int value) {
        this.value = value * 60;
        return this.value;
    }

}

