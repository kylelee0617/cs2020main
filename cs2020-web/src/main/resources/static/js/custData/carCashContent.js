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
    let $tableCC = $("#tableCC");
    bsTableInit($tableCC, mainTableCols);

    let $btnAddCC = $("#btnAddCC");
    $btnAddCC.click(function() {
        $tableCC.bootstrapTable('insertRow', {
            index: 0,
            row: {
                chisu: '',
                priceKind: '',
                priceName: '',
                per: '',
                price: '',
                patType: '',
                type: '',
            }
        });
    });

    let $getTableDataCC = $("#getTableDataCC");
    $getTableDataCC.click(function() {
        alert(JSON.stringify($tableCC.bootstrapTable('getData')));
    });

});