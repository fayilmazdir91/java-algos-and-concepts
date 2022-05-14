package fikstürOluþturucu;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Fikstur olusturucuya hosgeldin!");
		System.out.println("Fikstur kac takimdan olusacak ?");
		int n = scan.nextInt();
		
		List<String> teams = new ArrayList<>();
		
		System.out.println("Lutfen takim isimlerini girin : ");
		
		for(int i=1; i<=n; i++) {
			System.out.print(i+". Takim => ");
			String team = scan.next();
			teams.add(team);
			if(i==n) {
				System.out.println("Tum takimlar girildi.");
			}
		}
		
		if(n%2!=0) {
			teams.add("Bay");
			n += 1;
		}
		System.out.println("Takýmlar");
		System.out.println("--------");
		
		for(int i=0; i<teams.size(); i++) {
			System.out.println("- " + teams.get(i));
		}
		List<String> tempTeams = new ArrayList<>();
		
		while(0<teams.size()) {
			int ind = (int) (Math.random()*teams.size());
			tempTeams.add(teams.get(ind));
			teams.remove(ind);
		}
		
		teams=tempTeams;
		
		System.out.println();
		System.out.println("Takýmlar Karýþtýrýldý!");
		System.out.println("--------");
		
		for(int i=0; i<teams.size(); i++) {
			System.out.println("- " + teams.get(i));
		}
		
		int numWeek = n - 1;
		int matchPerWeek = n/2;
		
		LinkedHashMap<String, ArrayList<ArrayList<String>>> weeks = new LinkedHashMap<>();
		
		for(int i=1; i<=numWeek;i++) {
			String week = String.valueOf(i);
			weeks.put(week, new ArrayList<ArrayList<String>>());
		}
		
		for(int i=0; i<numWeek; i++){
            ArrayList<String> home = new ArrayList<>();
            ArrayList<String> away = new ArrayList<>();
            for (int j=0; j<matchPerWeek;j++){
                home.add(teams.get(j));
                away.add(teams.get((n-j)-1));
            }
            String week = String.valueOf(i+1);
            weeks.get(week).add(home);
            weeks.get(week).add(away);

            List<String> nTeams = new ArrayList<>();

            nTeams.add(teams.get(0));
            nTeams.add(teams.get(n-1));

            for(int k=1;k<teams.size()-1;k++){
                nTeams.add(teams.get(k));
            }
            teams=nTeams;
        }
		
		for(int i=0;i<2*numWeek;i++){
            System.out.println("#########################################################################");
            System.out.println("Week #"+(i+1));
            for(int j=0;j<matchPerWeek;j++){
                if(i<numWeek){
                    System.out.println(weeks.get(String.valueOf(i+1)).get(0).get(j)+" vs "+weeks.get(String.valueOf(i+1)).get(1).get(j));
                }else {
                    System.out.println(weeks.get(String.valueOf(i+1-numWeek)).get(1).get(j)+" vs "+weeks.get(String.valueOf(i+1-numWeek)).get(0).get(j));
                }

            }
        }
		
	}

	
}
