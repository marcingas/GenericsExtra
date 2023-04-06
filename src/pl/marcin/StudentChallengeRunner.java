package pl.marcin;

import pl.marcin.model.UJStudent;
import pl.marcin.util.QueryList;

import java.util.Comparator;
import java.util.List;

public class StudentChallengeRunner {
    public static void main(String[] args) {
        QueryList<UJStudent>queryList = new QueryList<>();
//        create new students for adding  to empty list queryList:
        for(int i = 0; i < 5; i++){
            queryList.add(new UJStudent());
        }
//        sort on this list using the inherited ArrayList's sort method:
        queryList.sort(Comparator.naturalOrder());
    }

    public static void printList(List<?> students){
        for(var student: students){
            System.out.println(student);
        }
    }
}
