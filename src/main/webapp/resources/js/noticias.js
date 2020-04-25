function remover(id) {
    $.ajax({
        url: `noticia?id=${id}`,
        type: 'DELETE',
        success: function(response) {
          window.location.reload();
        },
        error: function (response) {
          alert('Erro ao excluir noticia. Tente novamente');
        }
     });
}