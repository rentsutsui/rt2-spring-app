//document.addEventListener("DOMContentLoaded", function() {
//	const getCellValue = (tr, idx) => tr.children[idx].innerText || tr.children[idx].textContent;
//
//	const comparer = (idx, asc, type) => (a, b) => {
//		let v1 = getCellValue(a, idx);
//		let v2 = getCellValue(b, idx);
//
//		if (type === "number") {
//			v1 = parseFloat(v1) || 0;
//			v2 = parseFloat(v2) || 0;
//		} else if (type === "date") {
//			v1 = new Date(v1);
//			v2 = new Date(v2);
//		}
//
//		return ((v1 > v2) - (v1 < v2)) * (asc ? 1 : -1);
//	};
//
//	document.querySelectorAll(".sortable").forEach((th, idx) => {
//		let asc = true;
//		th.addEventListener("click", function() {
//			const table = th.closest("table");
//			Array.from(table.querySelectorAll("tr:nth-child(n+2)"))
//				.sort(comparer(idx, asc, th.getAttribute("data-type")))
//				.forEach(tr => table.appendChild(tr));
//
//			table.querySelectorAll("th").forEach(thElem => thElem.style.backgroundColor = "#dadfe8");
//			th.style.backgroundColor = "#97bbd3";
//
//			asc = !asc;
//		});
//	});
//});