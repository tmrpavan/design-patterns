public class Main {
    public static void main(String[] args) {
        URL youTubeUrl = URL.builder("https://", "youtube.com")
                .build();
        System.out.println(youTubeUrl.getUrl());

        URL youTubeUrlQuery = URL.builder("https://", "youtube.com")
                .pathParam("/tmr-pavan")
                .queryParam("?id=123")
                .build();
        System.out.println(youTubeUrlQuery.getUrl());
    }
}
