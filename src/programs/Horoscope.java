package programs;

import java.util.Scanner;

public class Horoscope {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello! Welcome to your horoscope generator! What is your first name?");
		String name = sc.next();
		System.out.println("Okay, " + name + ", what is the month of your birthday (1-12)?");
		int month = sc.nextInt();
		System.out.println("Now, enter the day of the month:");
		int day = sc.nextInt();
		String sign = "an unknown. ";
		String msg = "Try again for message.";
		if (month == 1) {
			if (day >= 20) {
				sign = "an Aquarius. ";
				msg = "If you pull together to get the worst out of the way, then you can all have fun with the more interesting tasks.";
			} else {
				sign = "a Capricorn. ";
				msg = "Relations with close friends should be enhanced by increased communication, perhaps some fascinating conversations about new ideas and exciting world events.";
			}
		}
		if (month == 2) {
			if (day >= 19) {
				sign = "a Pisces. ";
				msg = "Take the time to distinguish between what's real and what's illusion and you'll safely navigate any and all situations.";
			} else {
				sign = "an Aquarius. ";
				msg = "If you pull together to get the worst out of the way, then you can all have fun with the more interesting tasks.";
			}
		}
		if (month == 3) {
			if (day >= 21) {
				sign = "an Aries. ";
				msg = "When it comes to managing money today, you should go with your gut.";
			} else {
				sign = "a Pisces. ";
				msg = "Take the time to distinguish between what's real and what's illusion and you'll safely navigate any and all situations.";
			}
		}
		if (month == 4) {
			if (day >= 20) {
				sign = "a Taurus. ";
				msg = "By today's end, your mind could be spinning like a top. Take a walk and clear your head or you might not be able to sleep.";
			} else {
				sign = "an Aries. ";
				msg = "When it comes to managing money today, you should go with your gut.";
			}
		}
		if (month == 5) {
			if (day >= 21) {
				sign = "a Gemini. ";
				msg = "You may find that your instincts are right, particularly where other people are concerned.";
			} else {
				sign = "a Taurus. ";
				msg = "By today's end, your mind could be spinning like a top. Take a walk and clear your head or you might not be able to sleep.";
			}
		}
		if (month == 6) {
			if (day >= 21) {
				sign = "a Cancer. ";
				msg = "Social events and group activities could bring new interests your way that provide a rich field of knowledge";
			} else {
				sign = "a Gemini. ";
				msg = "You may find that your instincts are right, particularly where other people are concerned.";
			}
		}
		if (month == 7) {
			if (day >= 23) {
				sign = "a Leo. ";
				msg = "A number of people involved in the healing professions could cross your path today";
			} else {
				sign = "a Cancer. ";
				msg = "Social events and group activities could bring new interests your way that provide a rich field of knowledge";
			}
		}
		if (month == 8) {
			if (day >= 23) {
				sign = "a Virgo. ";
				msg = "A potential new love partner could show up, perhaps someone from a distant state or foreign country";
			} else {
				sign = "a Leo. ";
				msg = "A number of people involved in the healing professions could cross your path today";
			}
		}
		if (month == 9) {
			if (day >= 23) {
				sign = "a Libra. ";
				msg = "Family members could spring some surprising news on you today.";
			} else {
				sign = "a Virgo. ";
				msg = "A potential new love partner could show up, perhaps someone from a distant state or foreign country";
			}
		}
		if (month == 10) {
			if (day >= 23) {
				sign = "a Scorpio. ";
				msg = "Invitations to some exciting social events in your neighborhood could come today.";
			} else {
				sign = "a Libra. ";
				msg = "Family members could spring some surprising news on you today.";
			}
		}
		if (month == 11) {
			if (day >= 22) {
				sign = "a Sagittarius. ";
				msg = "You might receive a check in the mail. Take a friend out to lunch. You will both have fun.";
			} else {
				sign = "a Scorpio. ";
				msg = "Invitations to some exciting social events in your neighborhood could come today.";
			}
		}
		if (month == 12) {
			if (day >= 22) {
				sign = "a Capricorn. ";
				msg = "Relations with close friends should be enhanced by increased communication, perhaps some fascinating conversations about new ideas and exciting world events.";
			} else {
				sign = "a Sagittarius. ";
				msg = "You might receive a check in the mail. Take a friend out to lunch. You will both have fun.";
			}
		}
		System.out.println("Cool! You're " + sign + msg);
		sc.close();
	}

}
