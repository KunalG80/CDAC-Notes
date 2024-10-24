namespace DemoApp.Endpoints;

public class Greeting
{
    public static async Task Welcome(HttpResponse response)
    {
        await response.WriteAsync(
            $"""
            <html>
                <head>
                    <title>DemoApp</title>
                </head>
                <body>
                    <h1>Welcome Visitor</h1>
                    <p>
                        <b>Current Time: </b>{DateTime.Now}
                    </p>
                    <form method="POST" action="intrest">
                        <b>INPUT:</b>
                        <input type="text" name="principle"/>
                        <input type="text" name="period"/>
                        <input type="text" name="rate"/>
                        <input type="submit" value="GET INTREST"/>
                    </form>
                </body>
            </html>
            """);
    }

    public static async Task Hello(HttpRequest request, HttpResponse response)
    {
        double p = double.Parse(request.Form["principle"]);
        double t = double.Parse(request.Form["period"]);
        double r = double.Parse(request.Form["rate"]);
        double n = p * t * r/100;
        await response.WriteAsync(
            $"""
            <html>
                <head>
                    <title>DemoApp</title>
                </head>
                <body>
                    <h1>the principle is {p} , period is {t} and rate is {r}</h1>
                    <p>
                        <b>intrest is: </b>{n}
                    </p>
                </body>
            </html> 
            """
        );
    }
}
