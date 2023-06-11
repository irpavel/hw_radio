import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testNextIfMinLimit() {
        Radio radio = new Radio();
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextIfUpperMinLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextIfUnderMaxLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextIfMaxLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevIfUnderMaxLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevIfMaxLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevIfUpperMinLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevIfMinLimit() {
        Radio radio = new Radio();
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIfSetUnderMinLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIfSetMinLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIfSetUpperMinLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIfSetUnderMaxLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIfSetMaxLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIfSetUpperMaxLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPlusIfVolumeMinLimit() {
        Radio radio = new Radio();
        radio.plus();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPlusIfVolumeUpperMinLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.plus();

        int actual = radio.getCurrentVolume();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPlusIfVolumeUnderMaxLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.plus();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPlusIfVolumeMaxLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.plus();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinusIfVolumeMaxLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.minus();

        int actual = radio.getCurrentVolume();
        int expected = 99;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinusIfVolumeUnderMaxLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.minus();

        int actual = radio.getCurrentVolume();
        int expected = 98;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinusIfVolumeUpperMinLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.minus();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinusIfVolumeMinLimit() {
        Radio radio = new Radio();
        radio.minus();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}