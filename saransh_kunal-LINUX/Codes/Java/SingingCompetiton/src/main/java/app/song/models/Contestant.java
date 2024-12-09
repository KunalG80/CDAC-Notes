package app.song.models;
import app.song.data.SingerEntity;

public record Contestant(int id, String name , int age,int salary){

        public static Contestant  Candidate(SingerEntity entity){

            return new Contestant(
                entity.getId(),
                entity.getName(),
                entity.getAge(),
                entity.getSalary()

            );
        }

}