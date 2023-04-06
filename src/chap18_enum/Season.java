package chap18_enum;

public enum Season {
    SPRING("봄","3,4,5"){
        public void printSeasonMonth(){
            System.out.println(getKoreanSeason()+"은 " + getSeasonMonth() + "월 입니다.");
            //봄은 3,4,5월 입니다.
        }
    }, SUMMER("여름","6,7,8"){
        public void printSeasonMonth(){
            System.out.println(getKoreanSeason()+"은 " + getSeasonMonth() + "월 입니다.");

            //봄은 3,4,5월 입니다.
        }
    }, FALL("가을","9,10,11"){
        public void printSeasonMonth(){
            System.out.println(getKoreanSeason()+"은 " + getSeasonMonth() + "월 입니다.");

            //봄은 3,4,5월 입니다.
        }
    }, WINTER("겨울","12,1,2"){
        public void printSeasonMonth(){
            System.out.println(getKoreanSeason()+"은 " + getSeasonMonth() + "월 입니다.");

            //봄은 3,4,5월 입니다.
        }
    };
    private String koreanSeason;
    private String  SeasonMonth;

    public String getSeasonMonth() {
        return SeasonMonth;
    }
    public String getKoreanSeason() {
        return koreanSeason;
    }

    Season(String koreanSeason, String SeasonMonth){
        this.koreanSeason=koreanSeason;
        this.SeasonMonth = SeasonMonth;
    }


    public abstract void printSeasonMonth();

    @Override
    public String toString() {
        return "Season{" +
                "koreanSeason='" + koreanSeason + '\'' +
                ", SeasonMonth='" + SeasonMonth + '\'' +
                '}';
    }


}
