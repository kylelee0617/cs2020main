mainTableCols = [{
    checkbox: true
}, {
    field: 'chisu',
    title: '期數'
}, {
    field: 'priceKind',
    title: '款項'
}, {
    field: 'priceName',
    title: '款項名稱'
}, {
    field: '',
    title: '付款方式'
}, {
    field: 'per',
    title: '百分比'
}, {
    field: 'price',
    title: '金額'
}, {
    field: 'payType',
    title: '付款方式'
}, {
    field: 'type',
    title: '狀態'
}, ];

$(function() {
    let $tableHCash = $("#tableHCash");
    bsTableInit($tableHCash, mainTableCols);

    let $btnAddHCash = $("#btnAddHCash");
    $btnAddHCash.click(function() {
    	$tableHCash.bootstrapTable('insertRow', {
            index: 0,
            row: {
                chisu: '',
                priceKind: '',
                priceName: '',
                per: '',
                price: '',
                payType: '',
                type: '',
            }
        });
    });

    let $getTableDataHCash = $("#getTableDataHCash");
    $getTableDataHCash.click(function() {
        alert(JSON.stringify($tableHCash.bootstrapTable('getData')));
    });

});