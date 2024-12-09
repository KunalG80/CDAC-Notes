// console.log("loaded")

document.getElementById('btn').onclick =()=>{
    // console.log("clicked")
    var p = document.querySelector('.txt1').value;
    var c = document.querySelector('.txt2').value;
    var m = document.querySelector('.txt3').value;
    // console.log(c)
    // console.log(m)

    // console.log(m,isNaN(m))

    if(p==""||c==""||m==""){
        alert("fill the required field")
    }
    else if(isNaN(p)||isNaN(c)||isNaN(m)){
        alert("filed appropriate")
    }
    else{
        p = parseInt(p)
        c = parseInt(c)
        m = Number(m)


        var total = p+c+m;
        var percentage = total/300 * 100
        console.log(total);
        percentage = percentage.toFixed(2);
        console.log(percentage);


        document.querySelector("#r1").innerHTML = total;
        document.querySelector("#r2").innerHTML = percentage + "%";


        Highcharts.chart('container', {
            chart: {
                type: 'pie'
            },
            title: {
                text: 'YOUR PIE CHARTS VAERIFICATIONS'
            },
            tooltip: {
                valueSuffix: '%'
            },
            subtitle: {
                text:
                'Source:<a href="https://www.mdpi.com/2072-6643/11/3/684/htm" target="_default">MDPI</a>'
            },
            plotOptions: {
                series: {
                    allowPointSelect: true,
                    cursor: 'pointer',
                    dataLabels: [{
                        enabled: true,
                        distance: 20
                    }, {
                        enabled: true,
                        distance: -40,
                        format: '{point.percentage:.1f}%',
                        style: {
                            fontSize: '1.2em',
                            textOutline: 'none',
                            opacity: 0.7
                        },
                        filter: {
                            operator: '>',
                            property: 'percentage',
                            value: 10
                        }
                    }]
                }
            },
            series: [
                {
                    name: 'Percentage',
                    colorByPoint: true,
                    data: [
                        {
                            name: 'physics',
                            y: p 
                         },
                        {
                            name: 'chemistry',
                            y: c
                        },
                        {
                            name: 'Maths',
                            y: m
                        }
                    ]
                }
            ]
        });
    }

    
    

}
