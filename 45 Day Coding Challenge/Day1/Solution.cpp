#include <iostream>
#include <vector>
using namespace std;

string dayOfTheWeek(int day, int month, int year)
{
    // Array of days in each month
    int daysInMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    year = year - 1;
    int leapYearsDays = year / 400 + year / 4 - year / 100;
    int allDays = year * 365 + leapYearsDays;
    year = year + 1;

    // Check if the current year is a leap year
    daysInMonth[1] = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? 29 : 28;

    // Add days of the previous months
    for (int i = 0; i < month - 1; i++)
    {
        allDays += daysInMonth[i];
    }

    // Add the current day
    allDays += day;

    // Find the day of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
    int dayOfWeek = allDays % 7;

    switch (dayOfWeek)
    {
    case 0:
        return "Sunday";
    case 1:
        return "Monday";
    case 2:
        return "Tuesday";
    case 3:
        return "Wednesday";
    case 4:
        return "Thursday";
    case 5:
        return "Friday";
    case 6:
        return "Saturday";
    default:
        return "Invalid"; // This should never happen
    }
}

int main()
{
    int T; // Number of test cases
    cin >> T;

    // Use a vector of vectors to store the dates
    vector<vector<int>> dates(T, vector<int>(3)); // Each row will store [day, month, year]

    // Input the dates
    for (int i = 0; i < T; i++)
    {
        cin >> dates[i][0]; // Day
        cin >> dates[i][1]; // Month
        cin >> dates[i][2]; // Year
    }

    // Process each date and print the result
    for (int i = 0; i < T; i++)
    {
        int day = dates[i][0];
        int month = dates[i][1];
        int year = dates[i][2];
        cout << dayOfTheWeek(day, month, year) << endl;
    }

    return 0;
}
