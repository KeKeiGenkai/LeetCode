public class Donut {
    public static void main(String[] args) {
        // Размеры пончика
        int width = 33;
        int height = 17;

        // Создание и заполнение массива символами пробела
        char[][] donut = new char[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                donut[i][j] = ' ';
            }
        }

        // Заполнение пончика
        for (double theta = 0; theta < 2 * Math.PI; theta += 0.07) {
            double a = 2, b = 3;
            double x = Math.cos(theta);
            double y = Math.sin(theta);

            double z = 8.0 / (a + 2 * Math.sin(theta * 9));
            int i = (int) (height / 2 + z * y);
            int j = (int) (width / 2 + z * x * 2);

            if (i >= 0 && i < height && j >= 0 && j < width) {
                donut[i][j] = '.';
            }
        }

        // Вывод пончика в консоль
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(donut[i][j]);
            }
            System.out.println();
        }
    }
}
