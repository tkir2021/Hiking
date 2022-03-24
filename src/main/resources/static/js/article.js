$(function() {
  init();
});

function init() {
  $.ajax({
    url:/article/list,
    type:"GET",
    dataType: "json",
    success:function (e) {
      console.log(e)
    }
  })
}
