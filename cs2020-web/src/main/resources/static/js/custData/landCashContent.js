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
    let $tableLC = $("#tableLC");
    bsTableInit($tableLC, mainTableCols);

    let $btnAddLC = $("#btnAddLC");
    $btnAddLC.click(function() {
        $tableLC.bootstrapTable('insertRow', {
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

    let $getTableDataLC = $("#getTableDataLC");
    $getTableDataLC.click(function() {
        alert(JSON.stringify($tableLC.bootstrapTable('getData')));
    });

});