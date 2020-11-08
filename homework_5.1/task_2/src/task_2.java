import java.util.Arrays;

public class task_2 {
    public static void main(String[] args) {
        int PATIENT_NUMBER = 30;
        int MIN_PATIENT_TEMP = 32;
        int MAX_PATIENT_TEMP = 40;
        float MIN_HEALTHY_PATIENT = (float) 32.6;
        float MAX_HEALTHY_PATIENT = (float) 36.9;

        float scale = (float) Math.pow(10, 1);
        float average_temperature = 0;
        int num_healthy_patient = 0;

        float[] patiens = new float[PATIENT_NUMBER];
        for(int i = 0; i <= patiens.length - 1; i++) {
            float temperature = (float) (Math.random() * (MAX_PATIENT_TEMP - MIN_PATIENT_TEMP)) + MIN_PATIENT_TEMP;
            patiens[i] = (float) Math.ceil(temperature * scale) / scale;
            average_temperature += temperature;
            if(temperature >= MIN_HEALTHY_PATIENT && temperature <= MAX_HEALTHY_PATIENT) {
                num_healthy_patient++;
            }
        }
        System.out.println("Температуры пациентов: " + Arrays.toString(patiens));
        System.out.println("Средняя температура: " + Math.ceil((average_temperature / PATIENT_NUMBER) * scale) / scale);
        System.out.println("Количество здоровых: " + num_healthy_patient);
    }
}
