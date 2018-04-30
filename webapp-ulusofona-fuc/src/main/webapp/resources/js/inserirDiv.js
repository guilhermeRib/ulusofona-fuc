numRazoesFrequentar = 2;

$("#btnInserirNovaRazao").click(function () {
	var str1 = '<div class="razoes-frequentar" id="razoes-frequentar-';
	var str2 = '"> <h5>• Razão ';
	var str3 = '</h5> <textarea rows="4"> </textarea> </div>';
	var res = str1.concat(numRazoesFrequentar);
	res = res.concat(str2);
	res = res.concat(numRazoesFrequentar);
	res = res.concat(str3);
  	$("#divRazoesFrequentar").append(res);

  	numRazoesFrequentar++;
});