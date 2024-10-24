using DemoApp.Services;

namespace DemoApp.Endpoints;

public class Greeting
{
    public static async Task Welcome(HttpContext context , IIntrest ins)
    {       
        double p =0, t =0, r =0;
        if(context.Request.Method=="POST")
        {
        p = double.Parse(context.Request.Form["principle"]);
        t = double.Parse(context.Request.Form["period"]);
        r = double.Parse(context.Request.Form["rate"]);
        }

        await context.Response.WriteAsync(
            $"""
            <html>
                <head>
                    <title>DemoApp</title>
                </head>
                <body>
                    <h1>Welcome Visitor</h1>
                    <p>
                        <b>Intrest: </b>{ins.Intrest(p,t,r)}
                    </p>
                    <form method="POST">
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

   
}
