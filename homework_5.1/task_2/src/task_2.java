import java.util.Arrays;

public class task_2 {
    public static void main(String[] args) {
        final int PATIENT_NUMBER = 30;
        final int MIN_TEMP_PATIENT = 32;
        final int MAX_TEMP_PATIENT = 40;
        final float MIN_TEMP_HEALTHY_PATIENT = 36.2f;
        final float MAX_TEMP_HEALTHY_PATIENT = 36.9f;

        float scale = (float) Math.pow(10, 1);
        float sumTemperature = 0;
        int sumHealthyPatient = 0;

        float[] tempPatients = new float[PATIENT_NUMBER];
        for(int i = 0; i <= tempPatients.length - 1; i++) {
            float temperature = (float) (Math.random() * (MAX_TEMP_PATIENT - MIN_TEMP_PATIENT)) + MIN_TEMP_PATIENT;
            tempPatients[i] = (float) Math.ceil(temperature * scale) / scale;
            sumTemperature += temperature;
            if(temperature >= MIN_TEMP_HEALTHY_PATIENT && temperature <= MAX_TEMP_HEALTHY_PATIENT) {
                sumHealthyPatient++;
            }
        }
        System.out.println("Температуры пациентов: " + Arrays.toString(tempPatients).replaceAll("[\\[\\]]",""));
        System.out.println("Средняя температура: " + Math.ceil((sumTemperature / PATIENT_NUMBER) * scale) / scale);
        System.out.println("Количество здоровых: " + sumHealthyPatient);
    }
}
