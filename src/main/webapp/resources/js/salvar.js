function salvar(event) {
    event.preventDefault();
    
    var id = document.getElementById('id').value;
    var titulo = document.getElementById('titulo').value;
    var corpo = $("textarea").val();

    var formData = {};
    formData['titulo'] = titulo;
    formData['corpo'] = corpo;

    if (id > 0) {
        formData['id'] = id;
        put(id, formData);
    } else {
        post(formData);
    }
}

function post(formData) {
    $.post('/feed-noticias/salvar', formData).done((data) =>{
        window.location.href = 'feed-noticias/noticias';
    })
}

function put(id, formData) {
    $.ajax({
        url: `salvar?id=${id}`,
        type: 'PUT',
        data: formData,
        success: function(response) {
            window.location.href = '/noticias';
        },
        error: function (response) {
          alert('Erro ao atualizar noticia. Tente novamente');
        }
     });
}