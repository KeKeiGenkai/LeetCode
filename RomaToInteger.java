public int romanToInt(String s) {
        // 13. Roman to Integer
        //https://leetcode.com/problems/roman-to-integer/description/
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Проходим по строке справа налево
        for (int i = s.length() - 1; i >= 0; i--) {
        int value = romanValues.get(s.charAt(i));

        // Если значение текущей цифры меньше предыдущей, вычитаем его из результата
        if (value < prevValue) {
        result -= value;
        } else {
        // Иначе, прибавляем его к результату
        result += value;
        }

        // Обновляем предыдущее значение
        prevValue = value;
        }

        return result;
        }
        }