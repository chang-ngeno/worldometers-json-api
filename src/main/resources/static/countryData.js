/**
 * 
 */

Highcharts.chart('graph-cases-daily', {
	chart : {
		type : 'column'
	},
	title : {
		text : 'Daily New Cases'
	},

	subtitle : {
		text : 'Cases per Day<br>Data as of 0:00 GMT+0'
	},

	xAxis : {
		categories : [ "Feb 15", "Feb 16", "Feb 17", "Feb 18", "Feb 19",
				"Feb 20", "Feb 21", "Feb 22", "Feb 23", "Feb 24", "Feb 25",
				"Feb 26", "Feb 27", "Feb 28", "Feb 29", "Mar 01", "Mar 02",
				"Mar 03", "Mar 04", "Mar 05", "Mar 06", "Mar 07", "Mar 08",
				"Mar 09", "Mar 10", "Mar 11", "Mar 12", "Mar 13", "Mar 14",
				"Mar 15", "Mar 16", "Mar 17", "Mar 18", "Mar 19", "Mar 20",
				"Mar 21", "Mar 22", "Mar 23", "Mar 24", "Mar 25", "Mar 26",
				"Mar 27", "Mar 28", "Mar 29", "Mar 30", "Mar 31", "Apr 01",
				"Apr 02", "Apr 03", "Apr 04", "Apr 05", "Apr 06", "Apr 07",
				"Apr 08", "Apr 09", "Apr 10", "Apr 11", "Apr 12", "Apr 13",
				"Apr 14", "Apr 15", "Apr 16", "Apr 17", "Apr 18", "Apr 19",
				"Apr 20", "Apr 21", "Apr 22", "Apr 23", "Apr 24", "Apr 25",
				"Apr 26", "Apr 27", "Apr 28", "Apr 29", "Apr 30", "May 01",
				"May 02", "May 03", "May 04", "May 05", "May 06", "May 07",
				"May 08", "May 09", "May 10", "May 11", "May 12", "May 13",
				"May 14", "May 15", "May 16", "May 17", "May 18", "May 19" ]
	},

	yAxis : {
		title : {
			text : 'Novel Coronavirus Daily Cases'
		}
	},
	legend : {
		layout : 'vertical',
		align : 'right',
		verticalAlign : 'middle'
	},

	credits : {
		enabled : false
	},

	series : [ {
		name : 'Daily Cases',
		color : '#999',
		lineWidth : 5,
		data : [ null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, 0, 2, 0, 1, 3,
				0, 0, 0, 8, 1, 9, 3, 3, 0, 7, 4, 8, 9, 22, 29, 12, 4, 16, 16,
				14, 7, 5, 5, 2, 6, 11, 8, 9, 9, 12, 16, 8, 11, 15, 7, 17, 16,
				7, 12, 8, 11, 10, 12, 15, 24, 30, 25, 45, 47, 25, 14, 28, 23,
				28, 15, 22, 21, 23, 49, 57, 25, 51 ]
	}
	/*
	 * , { name: '7-day moving average', type: 'spline', data:
	 * [null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,0,1,1,1,1,0,2,2,3,3,3,4,4,4,5,5,7,12,13,12,15,15,16,14,11,9,10,7,8,6,6,8,8,10,10,11,11,11,13,12,12,12,12,11,12,10,11,13,16,18,23,28,31,30,30,30,30,25,23,21,23,26,31,30,35],
	 * lineWidth: 2, color: '#444'
	 *  }
	 */

	],

	responsive : {
		rules : [ {
			condition : {
				maxWidth : 800
			},
			chartOptions : {
				legend : {
					layout : 'horizontal',
					align : 'center',
					verticalAlign : 'bottom'
				}
			}
		} ]
	}

});




