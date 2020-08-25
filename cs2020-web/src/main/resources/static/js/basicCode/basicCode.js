mainTableCols = [{
    checkbox: true
}, {
    field: 'code2',
    title: '細項代碼'
}, {
    field: 'name2',
    title: '名稱'
}, {
    field: 'used',
    title: '啟用'
}, ];

$(function() {
    let $tableACs = $("#tableACs");
    bsTableInit($tableACs, mainTableCols);

    let $btnAddACs = $("#btnAddACs");
    $btnAddACs.click(function() {
        $tableACs.bootstrapTable('insertRow', {
            index: 0,
            row: {
                code2: '',
                name2: '',
                used: '',
            }
        });
    });

    let $getTableDataACs = $("#getTableDataACs");
    $getTableDataACs.click(function() {
        alert(JSON.stringify($tableACs.bootstrapTable('getData')));
    });

});