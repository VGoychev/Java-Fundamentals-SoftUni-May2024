package AssociativeArraysExercise;

import java.util.*;

public class P08_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> companies = new LinkedHashMap<>();
        while (true){
            String input = scanner.nextLine();
            if (input.equals("End")){
                break;
            }
            String [] tokens = input.split(" -> ");
            String companyName = tokens[0];
            String employeeId = tokens[1];

            if (!companies.containsKey(companyName)){
                companies.put(companyName, new ArrayList<>());
                companies.get(companyName).add(employeeId);
            } else {
                if (!companies.get(companyName).contains(employeeId)) {
                    companies.get(companyName).add(employeeId);
                }
            }

        }
        for (Map.Entry<String, List<String>> entry : companies.entrySet()){
            System.out.printf("%s%n", entry.getKey());
            for (String name : entry.getValue()) {
                System.out.printf("-- %s%n", name);
            }
        }
    }
}
