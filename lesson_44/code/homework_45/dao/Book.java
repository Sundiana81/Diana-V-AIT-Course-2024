package homework_45.dao;


    import java.util.List;

    public class Book {
        private String title;
        private List<Integer> ratings;

        public Book(String title, List<Integer> ratings) {
            this.title = title;
            this.ratings = ratings;
        }

        // Метод для вычисления среднего рейтинга книги
        public double getAverageRating() {
            return ratings.stream()
                    .mapToInt(Integer::intValue) // Преобразует каждую оценку в примитивный int
                    .average() // Вычисляет среднее значение
                    .orElse(0.0); // Если список пуст, возвращает 0.0
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Book{");
            sb.append("title='").append(title).append('\'');
            sb.append(", ratings=").append(ratings);
            sb.append('}');
            return sb.toString();
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<Integer> getRatings() {
            return ratings;
        }

        public void setRatings(List<Integer> ratings) {
            this.ratings = ratings;
        }
    }


